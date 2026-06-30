package we5;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f526875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yb5.d dVar) {
        super(1);
        this.f526875d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao holder = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = holder.f284926p;
        yb5.d dVar = this.f526875d;
        textView.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsw));
        holder.f284926p.setVisibility(0);
        holder.f284926p.setOnClickListener(new we5.h(holder, dVar));
        we5.q0.f526911a.a(dVar, holder);
        return jz5.f0.f384359a;
    }
}
