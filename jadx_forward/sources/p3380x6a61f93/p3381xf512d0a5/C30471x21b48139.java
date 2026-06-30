package p3380x6a61f93.p3381xf512d0a5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u0011"}, d2 = {"Lurgen/ur_0025/UR_95FA;", "", "<init>", "()V", "URB_94AE", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "active", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, "", "URB_ABD8", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "URB_C36B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: urgen.ur_0025.UR_95FA */
/* loaded from: classes14.dex */
public final class C30471x21b48139 {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3381xf512d0a5.C30471x21b48139 f77068x4fbc8495 = new p3380x6a61f93.p3381xf512d0a5.C30471x21b48139();

    private C30471x21b48139() {
    }

    /* renamed from: URB_94AE */
    public static final void m169204xe5782739(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, boolean active, int scene, byte[] extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        sk4.b bVar = (sk4.b) ((jm4.i0) obj);
        if (active) {
            f25.f0 f0Var = new f25.f0(java.lang.String.valueOf(scene));
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f0Var, new sk4.a(f0Var, bVar, scene, extraData));
            boolean z17 = ((g25.e) m96).f349513c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioModuleImpl", "scene: " + f0Var + ", gainFocus");
            bVar.f490499d = m96;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioModuleImpl", "session: " + bVar.f490499d + ", loseFocus");
        f25.m0 m0Var = bVar.f490499d;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            bVar.f490499d = null;
        }
    }

    /* renamed from: URB_ABD8 */
    public static final void m169205xe57bff0f(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        jm4.j0 j0Var = (jm4.j0) listener;
        sk4.b bVar = (sk4.b) ((jm4.i0) obj);
        java.util.concurrent.locks.ReentrantLock reentrantLock = bVar.f490501f;
        reentrantLock.lock();
        try {
            bVar.f490500e.add(j0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: URB_C36B */
    public static final void m169206xe57cadd6(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        jm4.j0 j0Var = (jm4.j0) listener;
        sk4.b bVar = (sk4.b) ((jm4.i0) obj);
        java.util.concurrent.locks.ReentrantLock reentrantLock = bVar.f490501f;
        reentrantLock.lock();
        try {
            bVar.f490500e.remove(j0Var);
        } finally {
            reentrantLock.unlock();
        }
    }
}
