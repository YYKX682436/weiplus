package bm2;

/* loaded from: classes3.dex */
public final class s8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.CheckBox f103827d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f103828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(bm2.v8 v8Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) itemView.findViewById(com.p314xaae8f345.mm.R.id.plv);
        this.f103827d = checkBox;
        this.f103828e = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.f569262pm0);
        checkBox.setClickable(false);
    }
}
