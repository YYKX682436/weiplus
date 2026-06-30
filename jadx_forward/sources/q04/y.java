package q04;

@j95.b
/* loaded from: classes12.dex */
public final class y extends i95.w implements xs.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f440943d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final u04.f f440944e = new u04.f(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f440945f = new q04.u(this);

    /* renamed from: g, reason: collision with root package name */
    public final q04.w f440946g = new q04.w(this);

    public final void Ai() {
        java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("recovery_storage").u("recovery_data_id", "");
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("recovery_storage").o("recovery_data_type", -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
        if ((u17.length() == 0) || o17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "checkIsNeedRecovery id or type is empty");
        } else {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ai(o17, u17, r45.x60.class, q04.v.f440939a);
        }
    }

    public boolean Bi(java.lang.String id6, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.util.HashMap hashMap = this.f440943d;
        hashMap.remove(id6);
        if (hashMap.isEmpty()) {
            u04.f fVar = this.f440944e;
            fVar.f505014b.removeCallbacks(fVar.f505015c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "unregisterRecoveryObserver, id: " + id6 + ", type: " + i17);
        Ai();
        return true;
    }

    public boolean Di(java.lang.String id6, int i17, r45.x60 protoBuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protoBuf, "protoBuf");
        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(i17, id6, protoBuf, new q04.x(id6, i17));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo204xfac946a6(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q04.y.mo204xfac946a6(android.content.Context):void");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "onAccountReleased");
        if (u04.d.f505009b) {
            this.f440945f.m43072x2efc64();
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "onCreate");
    }

    public boolean wi(java.lang.String id6, int i17, o04.p recoveryDataCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recoveryDataCallback, "recoveryDataCallback");
        u04.d dVar = u04.d.f505008a;
        if (!u04.d.f505009b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "registerRecoveryObserver, not enable recovery");
            return false;
        }
        java.util.HashMap hashMap = this.f440943d;
        if (hashMap.containsKey(id6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "registerRecoveryObserver, id already exist");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "registerRecoveryObserver, id: " + id6 + ", type: " + i17);
        hashMap.put(id6, new q04.t(id6, i17, recoveryDataCallback));
        this.f440946g.a();
        this.f440944e.a();
        return true;
    }
}
