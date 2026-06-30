package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class ug extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f292622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21432x204668e8 f292623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(android.content.Context context, com.p314xaae8f345.mm.ui.C21432x204668e8 c21432x204668e8) {
        super(0);
        this.f292622d = context;
        this.f292623e = c21432x204668e8;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.tg m78817x71d5fee7;
        m78817x71d5fee7 = this.f292623e.m78817x71d5fee7();
        return new android.view.GestureDetector(this.f292622d, m78817x71d5fee7);
    }
}
