package rh5;

/* loaded from: classes3.dex */
public final class i implements db5.t4, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f477360d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.k f477361e;

    /* renamed from: f, reason: collision with root package name */
    public final mf3.p f477362f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c f477363g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22450xe7b0d864 f477364h;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.ui.media.base.image.TranslateMenuListener$changeTransLangListener$1] */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, mf3.k mediaInfo, mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f477360d = activity;
        this.f477361e = mediaInfo;
        this.f477362f = apiCenter;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f477364h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364>(a0Var) { // from class: com.tencent.mm.ui.media.base.image.TranslateMenuListener$changeTransLangListener$1
            {
                this.f39173x3fe91575 = -348375692;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 event = c5234x14788364;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                rh5.i iVar = rh5.i.this;
                com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = iVar.f477363g;
                java.lang.String str = c10687xa533b04c != null ? c10687xa533b04c.f149355e : null;
                mf3.k kVar = iVar.f477361e;
                java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
                sf3.g e17 = kVar.e();
                java.lang.String c17 = e17 != null ? e17.c() : null;
                java.lang.String str2 = mo2110x5db1b11 + c17;
                mf3.p pVar = iVar.f477362f;
                sf3.f fVar = (sf3.f) pVar.c(sf3.f.class);
                sf3.k Q3 = fVar != null ? fVar.Q3(kVar) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeTransLangListener, eventSessionId: ");
                am.z1 z1Var = event.f135568g;
                sb6.append(z1Var.f90035a);
                sb6.append(", requestSessionId: ");
                sb6.append(str);
                sb6.append(", currentMediaInfoId: ");
                sb6.append(mo2110x5db1b11);
                sb6.append(", currentImgPath: ");
                sb6.append(c17);
                sb6.append(", currentState: ");
                sb6.append(Q3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.TranslateMenu", sb6.toString());
                if (str == null || !android.text.TextUtils.equals(str, z1Var.f90035a) || !android.text.TextUtils.equals(str, str2) || Q3 != sf3.k.f488932g) {
                    return false;
                }
                iVar.f477363g = null;
                eg3.b bVar = (eg3.b) pVar.a(eg3.b.class);
                if (bVar == null) {
                    return false;
                }
                ((eg3.g) bVar).T();
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        mo48814x2efc64();
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String c17;
        rf3.u uVar;
        mf3.s sVar;
        mo48813x58998cd();
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        mf3.p pVar = this.f477362f;
        if (valueOf != null && valueOf.intValue() == 16) {
            eg3.b bVar = (eg3.b) pVar.a(eg3.b.class);
            if (bVar != null) {
                mf3.p pVar2 = ((eg3.g) bVar).f334193o;
                rf3.q qVar = (rf3.q) pVar2.a(rf3.q.class);
                if (qVar != null && (sVar = (uVar = (rf3.u) qVar).f407643m) != null) {
                    uVar.t(sVar);
                }
                rf3.h hVar = (rf3.h) pVar2.a(rf3.h.class);
                if (hVar != null) {
                    hVar.D();
                    return;
                }
                return;
            }
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f477360d;
        mf3.k kVar = this.f477361e;
        if (valueOf != null && valueOf.intValue() == 18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.TranslateMenu", "longClickMenu_translateFeedback");
            sf3.g e17 = kVar.e();
            c17 = e17 != null ? e17.c() : null;
            if (c17 == null || !com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.TranslateMenu", "originalImagePath invalid: " + c17);
                return;
            } else {
                dm.aa bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z.class))).bj(c17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bj6, "getTranslationResult(...)");
                ((pn4.l1) ((mn4.f) i95.n0.c(mn4.f.class))).wi(mn4.e.CHAT, bj6.f65915xd108e39c, bj6.f65914xc84b1af5, bj6.f65918x22181090, bj6.f65917x195a47e9);
                dp.a.m125854x26a183b(activityC0065xcd7aa112, activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lwg), 1).show();
                return;
            }
        }
        if (valueOf != null && valueOf.intValue() == 19) {
            bg3.f fVar = (bg3.f) pVar.c(bg3.f.class);
            if (fVar != null) {
                fVar.S2(kVar);
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == 17) {
            java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
            sf3.g e18 = kVar.e();
            c17 = e18 != null ? e18.c() : null;
            java.lang.String str = mo2110x5db1b11 + c17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.TranslateMenu", "changeLanguage, currentMediaInfoId: " + mo2110x5db1b11 + ", currentImgPath: " + c17);
            com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
            c10687xa533b04c.f149354d = wd0.k2.IMAGE_OCR_TRANSLATE_RESULT;
            c10687xa533b04c.f149355e = str;
            this.f477363g = c10687xa533b04c.m45295x5a5dd5d();
            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activityC0065xcd7aa112, c10687xa533b04c);
        }
    }
}
