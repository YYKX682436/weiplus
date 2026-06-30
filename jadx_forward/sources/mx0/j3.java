package mx0;

/* loaded from: classes5.dex */
public final class j3 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public long f413598g;

    /* renamed from: h, reason: collision with root package name */
    public wu5.c f413599h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(android.widget.TextView recordTimeTv) {
        super(recordTimeTv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordTimeTv, "recordTimeTv");
    }

    public final void b() {
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            mo9067x901b6914(8);
            wu5.c cVar = this.f413599h;
            if (cVar != null) {
                cVar.cancel(true);
            }
            this.f413599h = null;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    public final void c(int i17) {
        int i18 = i17 / 1000;
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18 / 60), java.lang.Integer.valueOf(i18 % 60)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        this.f413347d.post(new mx0.i3(this, format));
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        b();
    }
}
