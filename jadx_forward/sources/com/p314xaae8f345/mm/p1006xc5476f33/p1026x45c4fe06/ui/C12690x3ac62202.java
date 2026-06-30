package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUITranslucentWorkaroundDelegate */
/* loaded from: classes7.dex */
public class C12690x3ac62202 implements p012xc85e97e9.p093xedfae76a.x, db5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a f170977d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f170978e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f170979f = false;

    public C12690x3ac62202(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a) {
        this.f170977d = activityC12666xc288131a;
    }

    @Override // db5.c
    public void k2() {
        this.f170978e = true;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onActivityResumed */
    public void m52923xba973e9() {
        if (this.f170979f) {
            db5.f.b(this.f170977d);
            this.f170979f = false;
        }
    }

    @Override // db5.c
    public void q4() {
        this.f170978e = false;
    }
}
