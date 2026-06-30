package my4;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final my4.b f414381d = new my4.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.CheckBox checkBox;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.ViewGroup viewGroup = it instanceof android.view.ViewGroup ? (android.view.ViewGroup) it : null;
        return java.lang.Boolean.valueOf((viewGroup == null || (checkBox = (android.widget.CheckBox) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a9h)) == null) ? false : checkBox.isChecked());
    }
}
