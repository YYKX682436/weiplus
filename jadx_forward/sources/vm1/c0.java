package vm1;

/* loaded from: classes10.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f519527h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519528i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f519529m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519524e = context;
        this.f519525f = str;
        this.f519526g = str2;
        this.f519527h = z17;
        this.f519528i = str3;
        this.f519529m = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vm1.c0(this.f519524e, this.f519525f, this.f519526g, this.f519527h, this.f519528i, this.f519529m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519523d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            um1.a aVar2 = mm1.b0.f410168i;
            um1.a aVar3 = mm1.b0.f410168i;
            if (aVar3 != null) {
                this.f519523d = 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) aVar3).a7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.content.Context context = this.f519524e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", pm0.v.Z(this.f519525f));
        intent.putExtra("feed_object_nonceId", pm0.v.Z(this.f519526g));
        boolean z17 = this.f519527h;
        intent.putExtra("key_need_related_list", z17);
        if (z17) {
            intent.putExtra("key_reuqest_scene", 35);
        }
        java.lang.String str = this.f519528i;
        intent.putExtra("key_session_id", str);
        if (str.length() > 0) {
            intent.putExtra("allow_pull_top", true);
        }
        zy2.ta.b(e1Var, context, intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", this.f519529m), false, 4, null);
        return f0Var;
    }
}
