package o00;

/* loaded from: classes11.dex */
public class c implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o00.d f423390a;

    public c(o00.d dVar) {
        this.f423390a = dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4e, viewGroup, false);
        o00.d dVar = this.f423390a;
        o00.b bVar = dVar.B;
        bVar.f423388a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzf);
        bVar.f423389b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.gyt);
        inflate.setTag(bVar);
        if (dVar.f288367c) {
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.gzg);
            if (findViewById != null) {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u);
            }
            android.widget.TextView textView = bVar.f423388a;
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        o00.b bVar2 = (o00.b) bVar;
        java.lang.String str = ((o00.d) dVar).f423391y;
        android.widget.TextView textView = bVar2.f423388a;
        if (textView != null) {
            if (str == null || str.length() == 0) {
                textView.setVisibility(8);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = textView.getContext();
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str, textSize));
                textView.setVisibility(0);
            }
        }
        if (this.f423390a.f423392z) {
            bVar2.f423389b.setVisibility(0);
        } else {
            bVar2.f423389b.setVisibility(8);
        }
    }
}
