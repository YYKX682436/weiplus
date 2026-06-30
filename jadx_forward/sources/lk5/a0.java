package lk5;

/* loaded from: classes14.dex */
public final class a0 {
    public a0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a(android.content.Intent inputIntent, java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputIntent, "inputIntent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cls, "cls");
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) cls.newInstance();
        android.os.Bundle extras = inputIntent.getExtras();
        android.os.Bundle bundle = new android.os.Bundle();
        if (extras != null) {
            extras.setClassLoader(cls.getClassLoader());
            bundle.putAll(extras);
        }
        c22584xf7d97e83.mo7562xe26dab14(bundle);
        c22584xf7d97e83.A.setComponent(inputIntent.getComponent());
        return c22584xf7d97e83;
    }
}
