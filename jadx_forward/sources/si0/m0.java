package si0;

/* loaded from: classes4.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f489661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(si0.n0 n0Var, android.content.Context context) {
        super(1);
        this.f489661d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p2845xc516c4b6.sns.C24835x13101917 c24835x13101917;
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(value) && (c24835x13101917 = (com.p314xaae8f345.p2845xc516c4b6.sns.C24835x13101917) value) != null) {
            c24835x13101917.m91997xfb82087d();
            c24835x13101917.m91998xb588721f();
            c24835x13101917.m91999x755bd410();
            c24835x13101917.m91996x1c4fb41d();
            double d17 = this.f489661d.getResources().getDisplayMetrics().density;
            android.graphics.Rect rect = new android.graphics.Rect((int) (c24835x13101917.m91997xfb82087d() * d17), (int) (c24835x13101917.m91998xb588721f() * d17), (int) ((c24835x13101917.m91997xfb82087d() + c24835x13101917.m91999x755bd410()) * d17), (int) ((c24835x13101917.m91998xb588721f() + c24835x13101917.m91996x1c4fb41d()) * d17));
            int i17 = rect.left;
            int i18 = rect.top;
            int width = rect.width();
            int height = rect.height();
            java.lang.ref.WeakReference weakReference = si0.w0.f489739a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee) weakReference.get() : null;
            if (activityC18058xc05952ee != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateThumbRect", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                if (activityC18058xc05952ee.f248690y0 == null) {
                    activityC18058xc05952ee.f248690y0 = new android.graphics.Rect();
                }
                activityC18058xc05952ee.f248690y0.set(i17, i18, width + i17, height + i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryUI", "updateThumbRect: %s", activityC18058xc05952ee.f248690y0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateThumbRect", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            }
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value);
        if (m143898xd4a2fc34 != null) {
            m143898xd4a2fc34.getMessage();
        }
        return jz5.f0.f384359a;
    }
}
