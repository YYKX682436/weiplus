package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class ge implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f64192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.le f64193e;

    public ge(com.tencent.mm.chatroom.ui.le leVar, java.util.Collection collection) {
        this.f64193e = leVar;
        this.f64192d = collection;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.util.ArrayList arrayList;
        int i18;
        com.tencent.mm.chatroom.ui.le leVar = this.f64193e;
        com.tencent.mm.chatroom.ui.le.a(leVar);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f64192d);
        if (!arrayList2.isEmpty()) {
            int i19 = com.tencent.mm.chatroom.ui.le.f64322l1;
            int i27 = leVar.H;
            int i28 = leVar.f64328d;
            int i29 = leVar.A;
            int i37 = (i27 - (i28 * 2)) / (i29 * 2);
            int i38 = leVar.C;
            int i39 = leVar.f64347z;
            if (i38 < i39) {
                i38 += i29;
            }
            int i47 = i38 - i39;
            java.util.ListIterator listIterator = arrayList2.listIterator();
            while (listIterator.hasNext()) {
                if (((kn.a) listIterator.next()).f309372c != leVar.D) {
                    listIterator.remove();
                }
            }
            java.util.Collections.sort(arrayList2, new com.tencent.mm.chatroom.ui.he(leVar));
            int i48 = 1;
            int i49 = 1;
            int i57 = 0;
            while (i48 <= leVar.B && i57 < arrayList2.size() && (i48 <= (i17 = leVar.f64346y) || -1 == i17)) {
                int i58 = (i47 * 2 * i37) + i28;
                if (((kn.a) arrayList2.get(i57)).f309371b == i48) {
                    arrayList = arrayList2;
                    i18 = i37;
                    ((java.util.HashMap) leVar.W).put(java.lang.Integer.valueOf(i49), new android.util.Pair((kn.a) arrayList2.get(i57), new android.graphics.Rect(i58, i19, i58 + (i37 * 2), leVar.F + i19)));
                    i57++;
                    i49++;
                } else {
                    arrayList = arrayList2;
                    i18 = i37;
                }
                i47++;
                if (i47 == i29) {
                    i19 += leVar.F;
                    i47 = 0;
                }
                i48++;
                i37 = i18;
                arrayList2 = arrayList;
            }
        }
        leVar.invalidate();
    }
}
