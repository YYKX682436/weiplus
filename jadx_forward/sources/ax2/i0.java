package ax2;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b f96589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b) {
        super(0);
        this.f96589d = c15393xd4ca7d1b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f96589d.f213363e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.SeekBar seekBar = (android.widget.SeekBar) view.findViewById(com.p314xaae8f345.mm.R.id.cmp);
        seekBar.setEnabled(false);
        return seekBar;
    }
}
