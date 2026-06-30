package eg2;

/* loaded from: classes3.dex */
public final class j0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 f334114a;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6) {
        this.f334114a = c14215x6ef072f6;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        yz5.l onCheckedChangeListener;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compoundButton, "<anonymous parameter 0>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6 = this.f334114a;
        if (c14215x6ef072f6.f193182f || (onCheckedChangeListener = c14215x6ef072f6.getOnCheckedChangeListener()) == null) {
            return;
        }
        onCheckedChangeListener.mo146xb9724478(java.lang.Boolean.valueOf(z17));
    }
}
