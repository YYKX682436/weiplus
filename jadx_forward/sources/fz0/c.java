package fz0;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f348816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Intent intent) {
        super(0);
        this.f348816d = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Integer.valueOf(this.f348816d.getIntExtra("key_from_comment_scene", 0));
    }
}
