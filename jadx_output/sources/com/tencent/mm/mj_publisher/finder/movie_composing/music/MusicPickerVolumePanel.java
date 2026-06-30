package com.tencent.mm.mj_publisher.finder.movie_composing.music;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010#\u001a\n \u0019*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R#\u0010&\u001a\n \u0019*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\"¨\u0006-"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/music/MusicPickerVolumePanel;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "d", "Lyz5/a;", "getWillDismissListener", "()Lyz5/a;", "setWillDismissListener", "(Lyz5/a;)V", "willDismissListener", "Lkotlin/Function1;", "", "e", "Lyz5/l;", "getOnOSTVolumeChangedListener", "()Lyz5/l;", "setOnOSTVolumeChangedListener", "(Lyz5/l;)V", "onOSTVolumeChangedListener", "f", "getOnMusicVolumeChangedListener", "setOnMusicVolumeChangedListener", "onMusicVolumeChangedListener", "Landroid/view/View;", "kotlin.jvm.PlatformType", "g", "Ljz5/g;", "getBackBtn", "()Landroid/view/View;", "backBtn", "Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJTextSeekBar;", "h", "getOstVolumeSeekBar", "()Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJTextSeekBar;", "ostVolumeSeekBar", "i", "getMusicVolumeSeekBar", "musicVolumeSeekBar", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class MusicPickerVolumePanel extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a willDismissListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.l onOSTVolumeChangedListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.l onMusicVolumeChangedListener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g backBtn;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g ostVolumeSeekBar;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g musicVolumeSeekBar;

    /* renamed from: m, reason: collision with root package name */
    public boolean f69191m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPickerVolumePanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.i iVar = jz5.i.f302831f;
        this.backBtn = jz5.h.a(iVar, new ev0.y(this));
        this.ostVolumeSeekBar = jz5.h.a(iVar, new ev0.b0(this));
        this.musicVolumeSeekBar = jz5.h.a(iVar, new ev0.a0(this));
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        view.setOnClickListener(new ev0.u(this));
        addView(view);
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfo, (android.view.ViewGroup) this, true);
        getBackBtn().setOnClickListener(new ev0.v(this));
        getOstVolumeSeekBar().setOnSeekBarChangeListener(new ev0.w(this));
        getMusicVolumeSeekBar().setOnSeekBarChangeListener(new ev0.x(this));
    }

    private final android.view.View getBackBtn() {
        return (android.view.View) this.backBtn.getValue();
    }

    private final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar getMusicVolumeSeekBar() {
        return (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) this.musicVolumeSeekBar.getValue();
    }

    private final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar getOstVolumeSeekBar() {
        return (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) this.ostVolumeSeekBar.getValue();
    }

    public final void a() {
        if (this.f69191m) {
            return;
        }
        this.f69191m = true;
        yz5.a aVar = this.willDismissListener;
        if (aVar != null) {
            aVar.invoke();
        }
        setEnabled(false);
        animate().cancel();
        animate().translationY(i65.a.h(getContext(), com.tencent.mm.R.dimen.agj)).setDuration(200L).withEndAction(new ev0.z(this)).start();
    }

    public final yz5.l getOnMusicVolumeChangedListener() {
        return this.onMusicVolumeChangedListener;
    }

    public final yz5.l getOnOSTVolumeChangedListener() {
        return this.onOSTVolumeChangedListener;
    }

    public final yz5.a getWillDismissListener() {
        return this.willDismissListener;
    }

    public final void setOnMusicVolumeChangedListener(yz5.l lVar) {
        this.onMusicVolumeChangedListener = lVar;
    }

    public final void setOnOSTVolumeChangedListener(yz5.l lVar) {
        this.onOSTVolumeChangedListener = lVar;
    }

    public final void setWillDismissListener(yz5.a aVar) {
        this.willDismissListener = aVar;
    }
}
