package dl2;

/* loaded from: classes3.dex */
public final class s implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public static final dl2.s f316793a = new dl2.s();

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 mmEditText = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) obj;
        android.text.TextWatcher textWatcher = (android.text.TextWatcher) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmEditText, "mmEditText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textWatcher, "textWatcher");
        mmEditText.removeTextChangedListener(textWatcher);
    }
}
