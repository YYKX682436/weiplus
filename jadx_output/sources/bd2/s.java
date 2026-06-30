package bd2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final bd2.s f19286a = new bd2.s();

    public final void a(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        int d17 = i65.a.d(holder.f293121e, com.tencent.mm.R.color.f478988mr);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6b);
        if (weImageView != null) {
            weImageView.s(com.tencent.mm.R.raw.finder_full_comment_outlined, com.tencent.mm.R.color.f479254u6);
            weImageView.setIconColor(d17);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.c79);
        if (p17 != null) {
            p17.setEnabled(false);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.c6s);
        if (textView != null) {
            textView.setTextColor(d17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6i);
        if (weImageView2 != null) {
            weImageView2.setIconColor(d17);
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.a_x);
        if (p18 != null) {
            p18.setEnabled(false);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g);
        if (textView2 != null) {
            textView2.setTextColor(d17);
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.ghd);
        if (p19 == null || !(p19 instanceof com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout)) {
            return;
        }
        ((com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) p19).setHidePrivateLike(true);
    }
}
