package jm3;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f381835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b f381836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b f381837f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b activityC16655xf855844b, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b activityC16655xf855844b2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f381836e = activityC16655xf855844b;
        this.f381837f = activityC16655xf855844b2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jm3.c1(this.f381836e, this.f381837f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jm3.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f381835d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b activityC16655xf855844b = this.f381836e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f381835d = 1;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b.f232422g;
            activityC16655xf855844b.getClass();
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new jm3.d1(activityC16655xf855844b, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                activityC16655xf855844b.finish();
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b activityC16655xf855844b2 = this.f381837f;
        android.content.Intent intent = booleanValue ? new android.content.Intent(activityC16655xf855844b2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532.class) : new android.content.Intent(activityC16655xf855844b2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16652x736766a6.class);
        byte[] byteArrayExtra = activityC16655xf855844b.getIntent().getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null) {
            intent.putExtra("key_track_data", byteArrayExtra);
        }
        pm0.v.g(intent, activityC16655xf855844b.getIntent(), "key_mv_music_duration", 0);
        pm0.v.g(intent, activityC16655xf855844b.getIntent(), "key_mv_from_scene", 0);
        pm0.v.g(intent, activityC16655xf855844b.getIntent(), "key_mv_enter_maker_ui_from_scene", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b activityC16655xf855844b3 = this.f381836e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16655xf855844b3, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI$createPreviewMv$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16655xf855844b3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16655xf855844b3, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI$createPreviewMv$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f381835d = 2;
        if (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) == aVar) {
            return aVar;
        }
        activityC16655xf855844b.finish();
        return jz5.f0.f384359a;
    }
}
