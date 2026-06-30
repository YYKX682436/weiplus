package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes12.dex */
public class o extends com.p314xaae8f345.mm.ui.p2708x5ccaae3b.q implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public int f290287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b f290288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b, com.p314xaae8f345.mm.ui.p2708x5ccaae3b.i iVar) {
        super(c22410xc19c546b, null);
        this.f290288g = c22410xc19c546b;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17;
        android.view.View d17;
        java.util.HashSet hashSet;
        int windowAttachCount;
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b = this.f290288g;
        c22410xc19c546b.getClass();
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar = c22410xc19c546b.H;
        if (hVar == null || hVar.getCount() <= 0 || (i17 = this.f290287f) == -1 || i17 >= c22410xc19c546b.H.getCount()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b2 = this.f290290e;
        boolean z18 = true;
        if (c22410xc19c546b2.hasWindowFocus()) {
            windowAttachCount = c22410xc19c546b2.getWindowAttachCount();
            if (windowAttachCount == this.f290289d) {
                z17 = true;
                if (z17 || (d17 = c22410xc19c546b.d(this.f290287f)) == null) {
                }
                int i18 = this.f290287f;
                if (i18 != -2) {
                    c22410xc19c546b.H.a(c22410xc19c546b.getFirstVisiblePosition() + i18);
                }
                if (c22410xc19c546b.f290255w != null) {
                    c22410xc19c546b.playSoundEffect(0);
                    d17.sendAccessibilityEvent(1);
                    cw1.j3 j3Var = ((cw1.C28108x5ed7638) c22410xc19c546b.f290255w).f304570a;
                    j3Var.getClass();
                    cw1.n3 n3Var = (cw1.n3) d17.getTag();
                    int i19 = n3Var.f304711a;
                    java.util.ArrayList arrayList = j3Var.f304559f;
                    long c17 = ((bw1.l) arrayList.get(i19)).c();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingDetailAdapter", "select header position=%d | headerId=%d", java.lang.Integer.valueOf(n3Var.f304711a), java.lang.Long.valueOf(c17));
                    java.util.HashSet hashSet2 = new java.util.HashSet();
                    for (int i27 = 0; i27 < arrayList.size(); i27++) {
                        if (((bw1.l) arrayList.get(i27)).c() == c17) {
                            hashSet2.add(java.lang.Integer.valueOf(i27));
                        }
                    }
                    java.util.Iterator it = hashSet2.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        hashSet = j3Var.f304557d;
                        if (!hasNext) {
                            break;
                        } else if (!hashSet.remove(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()))) {
                            z18 = false;
                        }
                    }
                    if (!z18) {
                        hashSet.addAll(hashSet2);
                    }
                    j3Var.c();
                    j3Var.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
        z17 = false;
        if (z17) {
        }
    }
}
