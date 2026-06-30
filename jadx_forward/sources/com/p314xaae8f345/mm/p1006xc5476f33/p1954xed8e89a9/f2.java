package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes4.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f234997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(android.app.Activity activity, java.lang.String str, int i17) {
        super(0);
        this.f234997d = activity;
        this.f234998e = str;
        this.f234999f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity = this.f234997d;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            db5.t7.e(activity, this.f234998e, this.f234999f);
        }
        return jz5.f0.f384359a;
    }
}
