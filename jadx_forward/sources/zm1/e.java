package zm1;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f555666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f555666d = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f555666d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.BizAudioFlutterActivity");
        android.widget.FrameLayout U6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) activityC0065xcd7aa112).U6();
        if (U6.getChildCount() > 0) {
            android.view.View childAt = U6.getChildAt(0);
            if (childAt instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) {
                return (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) childAt;
            }
        }
        return null;
    }
}
