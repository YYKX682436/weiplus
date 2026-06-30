package cw2;

/* loaded from: classes10.dex */
public final class l9 implements ek4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw2.m9 f305381a;

    public l9(cw2.m9 m9Var) {
        this.f305381a = m9Var;
    }

    @Override // ek4.a
    public void a(java.lang.String mediaId, int i17, dn.o task, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        long[] jArr = new long[3];
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37761x660d22b0(mediaId, jArr);
        cw2.k9 k9Var = (cw2.k9) this.f305381a.f305407b.get(mediaId);
        if (k9Var != null) {
            k9Var.f305343c++;
            k9Var.f305344d = jArr[0];
        }
    }

    @Override // ek4.a
    public void b(java.lang.String mediaId, int i17, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        cw2.k9 k9Var = (cw2.k9) this.f305381a.f305407b.get(mediaId);
        if (k9Var != null) {
            k9Var.f305342b++;
        }
    }

    @Override // ek4.a
    public void c(java.lang.String mediaId, int i17, dn.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        cw2.m9 m9Var = this.f305381a;
        if (m9Var.f305407b.size() > 50) {
            java.util.concurrent.ConcurrentSkipListMap concurrentSkipListMap = m9Var.f305407b;
            concurrentSkipListMap.remove(concurrentSkipListMap.firstKey());
        }
        cw2.k9 k9Var = (cw2.k9) m9Var.f305407b.get(mediaId);
        if (k9Var != null) {
            k9Var.f305341a++;
        } else {
            m9Var.f305407b.put(mediaId, new cw2.k9(1, 0, 0, 0L));
        }
    }

    @Override // ek4.a
    public void f(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        cw2.k9 k9Var = (cw2.k9) this.f305381a.f305407b.get(mediaId);
        if (k9Var != null) {
            k9Var.f305344d = j17;
        }
    }
}
