package l34;

/* loaded from: classes12.dex */
public final class g extends l34.c {

    /* renamed from: a, reason: collision with root package name */
    public static final l34.g f396967a = new l34.g();

    @Override // l34.c
    public android.content.Intent a() {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity"));
        intent.setAction("coloros.intent.action.launcher.SHORTCUT_SETTINGS");
        return intent;
    }
}
