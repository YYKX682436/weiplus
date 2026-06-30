package yt3;

/* loaded from: classes10.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f547073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f547074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.on0 f547076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(yt3.r4 r4Var, lt3.f0 f0Var, java.lang.String str, r45.on0 on0Var) {
        super(0);
        this.f547073d = r4Var;
        this.f547074e = f0Var;
        this.f547075f = str;
        this.f547076g = on0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yt3.r4 r4Var = this.f547073d;
        yt3.r4.b(r4Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_thumb_path", this.f547074e.f402745a.f412822a.f494067e);
        intent.putExtra("key_bg_mix_task_id", this.f547075f);
        intent.putExtra("key_video_duration", this.f547076g.f463897d);
        intent.putExtra("key_extra_data", ut3.f.f512709c.f512711b);
        android.content.Context context = r4Var.f547179d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).setResult(888, intent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).finish();
        return jz5.f0.f384359a;
    }
}
