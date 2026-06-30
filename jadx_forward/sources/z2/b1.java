package z2;

/* loaded from: classes13.dex */
public abstract class b1 {
    public static android.app.Notification.Builder a(android.app.Notification.Builder builder, android.app.Person person) {
        return builder.addPerson(person);
    }

    public static android.app.Notification.Action.Builder b(android.app.Notification.Action.Builder builder, int i17) {
        return builder.setSemanticAction(i17);
    }
}
