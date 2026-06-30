package es;

/* loaded from: classes15.dex */
public class t extends es.w implements es.b {

    /* renamed from: a, reason: collision with root package name */
    public int f337809a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f337810b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ext.ui.C10455x858f5ab f337811c;

    public t(com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab, es.l lVar) {
        this.f337811c = c10455x858f5ab;
    }

    @Override // es.w
    public void a(android.view.View view, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab = this.f337811c;
        if (!c10455x858f5ab.f146507u) {
            kd.c.e("MicroMsg.SwipeBackLayout", "[onViewPositionChanged] mHasTranslucent is false", new java.lang.Object[0]);
            return;
        }
        c10455x858f5ab.f146501o = java.lang.Math.abs(i17 / (c10455x858f5ab.f146499m.getWidth() + c10455x858f5ab.f146502p.getIntrinsicWidth()));
        c10455x858f5ab.f146495f = i17;
        c10455x858f5ab.f146496g = i18;
        c10455x858f5ab.invalidate();
        es.n nVar = c10455x858f5ab.f146512z;
        if (nVar != null) {
            float f17 = c10455x858f5ab.f146501o;
            al5.g3 g3Var = ((pa3.q) nVar).f434531a.f87118g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g3Var);
            ((ak3.h) g3Var).R(i17, i18, i19, i27, f17);
        }
        if (java.lang.Float.compare(c10455x858f5ab.f146501o, 1.0f) >= 0 && !c10455x858f5ab.f146508v) {
            c10455x858f5ab.f146508v = true;
            c10455x858f5ab.B.post(new es.o(this));
        } else if (java.lang.Float.compare(c10455x858f5ab.f146501o, 0.01f) <= 0) {
            c10455x858f5ab.f146509w = false;
            kd.c.e("MicroMsg.SwipeBackLayout", "[onViewPositionChanged] mScrollPercent:%s mHasCallPopOut:%s", java.lang.Float.valueOf(c10455x858f5ab.f146501o), java.lang.Boolean.valueOf(c10455x858f5ab.f146508v));
        }
        if (c10455x858f5ab.f146500n.f337819a == 1) {
            es.k.b(c10455x858f5ab.f146501o);
        }
    }
}
