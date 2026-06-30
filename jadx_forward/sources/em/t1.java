package em;

/* loaded from: classes11.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f336344a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f336345b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.CheckBox f336346c;

    public t1(android.view.View view) {
        this.f336344a = view;
    }

    public android.widget.CheckBox a() {
        if (this.f336346c == null) {
            this.f336346c = (android.widget.CheckBox) this.f336344a.findViewById(com.p314xaae8f345.mm.R.id.srw);
        }
        return this.f336346c;
    }

    public android.widget.TextView b() {
        if (this.f336345b == null) {
            this.f336345b = (android.widget.TextView) this.f336344a.findViewById(com.p314xaae8f345.mm.R.id.vhb);
        }
        return this.f336345b;
    }
}
