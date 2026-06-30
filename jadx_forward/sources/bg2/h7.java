package bg2;

/* loaded from: classes12.dex */
public final class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f f101678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f101679f;

    public h7(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, bg2.j7 j7Var) {
        this.f101677d = i17;
        this.f101678e = fVar;
        this.f101679f = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update req for ");
        int i17 = this.f101677d;
        sb6.append(i17);
        sb6.append(' ');
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f101678e;
        sb6.append(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", sb6.toString());
        bg2.j7 j7Var = this.f101679f;
        java.util.Iterator it = j7Var.f101744a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((bg2.r6) obj).f102002d == i17) {
                    break;
                }
            }
        }
        bg2.r6 r6Var = obj instanceof bg2.r6 ? (bg2.r6) obj : null;
        if (r6Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
            r6Var.f102003e = fVar;
        }
        java.lang.Object obj2 = j7Var.f101745b.get(java.lang.Integer.valueOf(i17));
        bg2.r6 r6Var2 = obj2 instanceof bg2.r6 ? (bg2.r6) obj2 : null;
        if (r6Var2 == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
        r6Var2.f102003e = fVar;
    }
}
