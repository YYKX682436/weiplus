package wa5;

/* loaded from: classes14.dex */
public abstract class k {
    public static final wa5.i a(android.view.View view, java.lang.String transitionName, java.lang.Object obj) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionName, "transitionName");
        java.util.Objects.toString(obj);
        view.toString();
        view.setTransitionName(transitionName);
        if (view instanceof ya5.a) {
            android.content.Context context = view.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (list = wa5.d.f525848a.a(activity).f525846e) != null) {
                list.add(new java.lang.ref.WeakReference(view));
            }
        }
        wa5.i iVar = new wa5.i(transitionName, obj);
        view.setTag(com.p314xaae8f345.mm.R.id.msq, iVar);
        return iVar;
    }
}
