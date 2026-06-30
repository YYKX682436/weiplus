package h9;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.BufferedReader f361155a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f361156b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f361157c;

    public f(java.util.Queue queue, java.io.BufferedReader bufferedReader) {
        this.f361156b = queue;
        this.f361155a = bufferedReader;
    }

    public boolean a() {
        java.lang.String trim;
        if (this.f361157c != null) {
            return true;
        }
        java.util.Queue queue = this.f361156b;
        if (!queue.isEmpty()) {
            this.f361157c = (java.lang.String) queue.poll();
            return true;
        }
        do {
            java.lang.String readLine = this.f361155a.readLine();
            this.f361157c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f361157c = trim;
        } while (trim.isEmpty());
        return true;
    }
}
