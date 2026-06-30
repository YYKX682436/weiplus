package vh;

/* loaded from: classes12.dex */
public class r extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f518349f;

    public r(android.view.View view) {
        super(view);
        this.f518349f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        vh.g gVar = (vh.g) hVar;
        this.f518351d = gVar;
        if (android.text.TextUtils.isEmpty(gVar.f518320d)) {
            return;
        }
        this.f518349f.setText(gVar.f518320d);
    }
}
