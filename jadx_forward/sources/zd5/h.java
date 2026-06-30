package zd5;

/* loaded from: classes.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f553220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.View convertView, android.content.Context context) {
        super(convertView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View findViewById = convertView.findViewById(com.p314xaae8f345.mm.R.id.gfy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f553220d = textView;
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        android.view.View findViewById2 = convertView.findViewById(com.p314xaae8f345.mm.R.id.gfp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.view.View");
        findViewById2.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf));
    }
}
