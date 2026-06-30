package d90;

@j95.b
/* loaded from: classes11.dex */
public final class q extends i95.w implements d90.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f308978d = "MarkdownService";

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f308978d, "MarkdownService onCreate");
    }

    public d90.i wi(d90.j callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f308978d, "createParser");
        return new d90.p(callback);
    }
}
