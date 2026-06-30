package bm2;

/* loaded from: classes3.dex */
public final class s8 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.CheckBox f22294d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f22295e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(bm2.v8 v8Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) itemView.findViewById(com.tencent.mm.R.id.plv);
        this.f22294d = checkBox;
        this.f22295e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f487729pm0);
        checkBox.setClickable(false);
    }
}
