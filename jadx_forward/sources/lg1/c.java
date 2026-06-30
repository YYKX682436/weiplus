package lg1;

/* loaded from: classes5.dex */
public class c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f400087d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f400088e;

    public c(android.content.Context context) {
        super(context);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3w, this);
        this.f400087d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f400088e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h5n);
    }

    /* renamed from: setStep */
    public void m145732x7650364e(lg1.b bVar) {
        android.widget.ImageView imageView = this.f400088e;
        android.widget.TextView textView = this.f400087d;
        if (bVar == null) {
            textView.setText((java.lang.CharSequence) null);
            imageView.setImageDrawable(null);
        } else {
            textView.setText(bVar.f400085a);
            int i17 = bVar.f400086b;
            imageView.setImageResource(i17 != -2 ? i17 != 0 ? i17 != 2 ? com.p314xaae8f345.mm.R.C30861xcebc809e.brt : com.p314xaae8f345.mm.R.C30861xcebc809e.brs : com.p314xaae8f345.mm.R.C30861xcebc809e.bru : com.p314xaae8f345.mm.R.C30861xcebc809e.brv);
        }
    }
}
