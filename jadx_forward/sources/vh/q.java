package vh;

/* loaded from: classes12.dex */
public class q extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f518348f;

    public q(android.view.View view) {
        super(view);
        this.f518348f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        vh.f fVar = (vh.f) hVar;
        this.f518351d = fVar;
        this.f518348f.setText(fVar.f518319d);
    }
}
