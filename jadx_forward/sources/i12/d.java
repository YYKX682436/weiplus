package i12;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f368734a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f368735b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f368736c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f368737d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f368738e;

    public d(android.content.Context context, int i17) {
        this.f368735b = com.p314xaae8f345.mm.ui.id.b(context).inflate(i17, (android.view.ViewGroup) null);
        a();
    }

    public final void a() {
        android.view.View view = this.f368735b;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.BaseEmojiStoreItemViewHolder", "initView failed. root is null.");
            return;
        }
        this.f368736c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hhr);
        this.f368737d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hjn);
        this.f368738e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hhm);
    }

    public d(android.content.Context context, android.view.View view) {
        this.f368735b = view;
        a();
    }
}
