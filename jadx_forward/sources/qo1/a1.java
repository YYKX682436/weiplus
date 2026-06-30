package qo1;

/* loaded from: classes5.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f446983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.c1 f446984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 f446985f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, qo1.c1 c1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 h1Var) {
        super(0);
        this.f446983d = f0Var;
        this.f446984e = c1Var;
        this.f446985f = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        java.util.ArrayList<jz5.l> arrayList;
        int i17 = this.f446983d.f391649d;
        if (i17 != 0) {
            return java.lang.Integer.valueOf(i17);
        }
        qo1.c1 c1Var = this.f446984e;
        java.lang.Object obj = c1Var.f447025r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.wechat.aff.affroam.AffRoamBackedUpConversationsInfo");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f) obj;
        java.util.List<java.lang.String> list = c1Var.f446990w;
        boolean isEmpty = list.isEmpty();
        java.util.LinkedList linkedList = fVar.f297357d;
        java.util.LinkedList linkedList2 = fVar.f297358e;
        if (isEmpty) {
            arrayList = new java.util.ArrayList();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getConversationId(...)");
            j17 = 0;
            int i18 = 0;
            for (java.lang.Object obj2 : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.Long l17 = (java.lang.Long) linkedList2.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                j17 += l17.longValue();
                arrayList.add(new jz5.l((java.lang.String) obj2, l17));
                i18 = i19;
            }
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getConversationId(...)");
            int i27 = 0;
            for (java.lang.Object obj3 : linkedList) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str = (java.lang.String) obj3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                java.lang.Object obj4 = linkedList2.get(i27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                hashMap.put(str, obj4);
                i27 = i28;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            j17 = 0;
            for (java.lang.String str2 : list) {
                java.lang.Long l18 = (java.lang.Long) hashMap.get(str2);
                if (l18 == null) {
                    l18 = 1024L;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
                long longValue = l18.longValue();
                j17 += longValue;
                arrayList2.add(new jz5.l(str2, java.lang.Long.valueOf(longValue)));
            }
            arrayList = arrayList2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restore list.size=");
        sb6.append(arrayList.size());
        sb6.append(", sumSize=");
        sb6.append(j17);
        sb6.append(", pkgId=");
        long j18 = c1Var.f447016i;
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamRestoreTask", sb6.toString());
        if (arrayList.isEmpty()) {
            return 1;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j0 j0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j0();
        j0Var.f297408e = j17;
        for (jz5.l lVar : arrayList) {
            java.lang.String str3 = (java.lang.String) lVar.f384366d;
            long longValue2 = ((java.lang.Number) lVar.f384367e).longValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s sVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s();
            sVar.f297507d = str3;
            sVar.f297508e = 0L;
            sVar.f297509f = java.lang.System.currentTimeMillis();
            sVar.f297510g = longValue2;
            j0Var.f297407d.add(sVar);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 g17 = this.f446985f.g(j0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamRestoreTask", "[+] New Restore task, pkgId = " + j18 + ", taskInfo = " + g17.f297435d);
        c1Var.f447025r = g17;
        c1Var.f447024q = new qo1.z0(c1Var);
        return 0;
    }
}
