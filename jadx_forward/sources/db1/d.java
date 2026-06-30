package db1;

/* loaded from: classes5.dex */
public final class d implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db1.p f309371a;

    public d(db1.p pVar) {
        this.f309371a = pVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compoundButton, "<anonymous parameter 0>");
        db1.p pVar = this.f309371a;
        pVar.D.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        pVar.f309399w.setEnabled(z17);
    }
}
