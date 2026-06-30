package ie3;

/* loaded from: classes7.dex */
public abstract class j extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        jc3.u0 u0Var = jc3.u0.f380529a;
        if (((java.util.ArrayList) jc3.u0.f380533e).contains(resource.m117638xfb82e301())) {
            he3.e eVar = (he3.e) ((ie3.i) i95.n0.c(ie3.i.class));
            eVar.getClass();
            jc3.w0 w0Var = jc3.w0.f380543a;
            java.lang.String d17 = resource.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getProjectId(...)");
            java.lang.String str = (java.lang.String) jc3.u0.f380540l.get(d17);
            if (str != null) {
                d17 = str;
            }
            long j18 = resource.f299123e;
            java.lang.String m117639xfb83cc9b = resource.m117639xfb83cc9b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m117639xfb83cc9b);
            eVar.oj(d17, (int) j18, m117639xfb83cc9b);
        }
    }
}
