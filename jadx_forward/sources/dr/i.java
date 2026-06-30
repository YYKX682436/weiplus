package dr;

/* loaded from: classes12.dex */
public final class i extends dr.t {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f323921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, android.widget.ImageView view, android.graphics.drawable.Drawable drawable) {
        super(emojiInfo, view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f323921d = drawable;
    }

    @Override // dr.s
    public er.f b() {
        zq.h hVar = zq.h.f556505a;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f323933a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        return hVar.a((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb);
    }

    @Override // dr.s
    public void c(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f323935c;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view != null) {
            view.setTag(com.p314xaae8f345.mm.R.id.dbt, null);
        }
        ar.c cVar = ar.c.f94889a;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f323933a;
        android.graphics.Bitmap a17 = cVar.a(interfaceC4987x84e327cb.mo42933xb5885648());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverRequest", "onLoad: " + interfaceC4987x84e327cb.mo42933xb5885648() + ", " + a17 + ", " + (a17 != null ? a17.getWidth() : -1) + ", " + (a17 != null ? a17.getHeight() : -1) + ", " + (a17 != null ? a17.getConfig() : null));
        pm0.v.X(new dr.h(this, z17, a17));
    }

    @Override // dr.s
    public void f(boolean z17) {
        android.widget.ImageView imageView;
        ar.c cVar = ar.c.f94889a;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f323933a;
        android.graphics.Bitmap a17 = cVar.a(interfaceC4987x84e327cb.mo42933xb5885648());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverRequest", "start: " + interfaceC4987x84e327cb.mo42933xb5885648() + ", " + a17);
        if (a17 != null) {
            c(true);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f323935c;
        if (weakReference != null && (imageView = (android.widget.ImageView) weakReference.get()) != null) {
            imageView.setImageDrawable(this.f323921d);
        }
        dr.s.e(this, false, 1, null);
    }
}
