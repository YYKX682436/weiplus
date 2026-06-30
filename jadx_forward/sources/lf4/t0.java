package lf4;

/* loaded from: classes4.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f400017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f400018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f400019f;

    public t0(lf4.j1 j1Var, int i17, int i18) {
        this.f400017d = j1Var;
        this.f400018e = i17;
        this.f400019f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.j1 j1Var = this.f400017d;
        int i17 = this.f400018e;
        j1Var.f399959p = i17;
        int i18 = this.f400019f;
        j1Var.f399960q = i18;
        java.lang.Object obj = ((java.util.ArrayList) j1Var.f399955i.get(i17)).get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        if4.f fVar = (if4.f) obj;
        ef4.v vVar = ef4.w.f334001t;
        nf4.j J0 = vVar.i().J0(fVar.f372780e.f372786a);
        nf4.l i19 = vVar.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if4.h hVar = fVar.f372780e;
        sb6.append(hVar.f372786a);
        sb6.append('_');
        sb6.append(hVar.f372788c);
        java.lang.String localId = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        i19.f418406i.add(localId);
        if (J0 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LogStory: deleteItem2 storyinfo ");
            sb7.append(fVar);
            sb7.append(" deleteItemRow ");
            sb7.append(j1Var.f399959p);
            sb7.append(" deleteItemCol ");
            sb7.append(j1Var.f399960q);
            sb7.append(" localid ");
            int i27 = hVar.f372786a;
            sb7.append(i27);
            sb7.append(' ');
            sb7.append(J0.f69410x443468b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j1Var.f399954h, sb7.toString());
            long j17 = J0.f69410x443468b;
            if (j17 == 0) {
                ef4.e0.f333974a.a(i27);
                pm0.v.X(new lf4.w0(true, j1Var));
            } else if (j1Var.f399959p != -1 && j1Var.f399960q != -1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList.add(new ff4.p(j17, 1));
                arrayList2.add(java.lang.Integer.valueOf(i27));
                gm0.j1.n().f354821b.g(new ff4.e(arrayList, arrayList2));
            }
        }
        if (hVar.a()) {
            vVar.l().mo50293x3498a0(new lf4.s0(j1Var, fVar));
        }
    }
}
