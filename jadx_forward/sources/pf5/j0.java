package pf5;

/* loaded from: classes.dex */
public abstract class j0 {
    public static final android.content.Intent a(android.content.Intent intent, java.lang.Class intentAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intentAction, "intentAction");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_intent_action_uic_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        if (!stringArrayListExtra.contains(intentAction.getName())) {
            stringArrayListExtra.add(intentAction.getName());
        }
        intent.putStringArrayListExtra("key_intent_action_uic_list", stringArrayListExtra);
        return intent;
    }
}
