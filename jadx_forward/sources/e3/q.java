package e3;

/* loaded from: classes13.dex */
public abstract class q {
    public static android.os.ParcelFileDescriptor a(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
