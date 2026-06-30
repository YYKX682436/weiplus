package r23;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final r23.i f450359d = new r23.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r23.c cVar = r23.j.f450361b;
        boolean z17 = false;
        int i17 = 1;
        if (cVar != null && cVar.f450345f) {
            if (!r23.j.f450368i) {
                if (cVar != null && cVar.a()) {
                    z17 = true;
                }
                if (!z17) {
                    if (!r23.j.f450367h) {
                        i17 = 9;
                    }
                }
            }
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i17);
        } else {
            i17 = -1;
        }
        if (i17 > 0) {
            java.lang.ref.WeakReference weakReference = r23.j.f450363d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) weakReference.get() : null;
            if (activityC15653x403456cd != null && i17 > 0) {
                activityC15653x403456cd.Q = i17;
                activityC15653x403456cd.a8(activityC15653x403456cd.f220061m.J());
            }
            java.lang.ref.WeakReference weakReference2 = r23.j.f450364e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561) weakReference2.get() : null;
            if (activityC15656x6f26b561 != null) {
                activityC15656x6f26b561.H7(i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
