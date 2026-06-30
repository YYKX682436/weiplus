package lk5;

/* loaded from: classes11.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42 f400600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42 activityC22582xf7828f42) {
        super(0);
        this.f400600d = activityC22582xf7828f42;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f400600d.getIntent();
        android.content.Intent intent2 = intent != null ? (android.content.Intent) intent.getParcelableExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39703xd3a3c634) : null;
        android.content.Intent intent3 = intent2 instanceof android.content.Intent ? intent2 : null;
        return intent3 == null ? new android.content.Intent() : intent3;
    }
}
