package sw1;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sw1.c f494979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sw1.c cVar) {
        super(1);
        this.f494979d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        sw1.c cVar = this.f494979d;
        java.lang.CharSequence text = ((android.widget.TextView) cVar.mo144222x4ff8c0f0(android.R.id.title)).getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(text, "null cannot be cast to non-null type android.text.SpannedString");
        return ((android.text.SpannedString) text).toString() + ((com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) cVar.mo144222x4ff8c0f0(android.R.id.summary)).a().toString();
    }
}
