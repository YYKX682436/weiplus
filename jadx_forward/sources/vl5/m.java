package vl5;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f519470b;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f519474f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f519469a = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public int f519471c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f519472d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f519473e = false;

    public m(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395) {
        this.f519474f = c22722xd3be5395;
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), "dslv_state.txt");
        this.f519470b = file;
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile()) {
                com.p314xaae8f345.mm.ui.yk.b("mobeta", "creat file fail!! file already exist", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.ui.yk.a("mobeta", "file created", new java.lang.Object[0]);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.mm.ui.yk.f("mobeta", "Could not create dslv_state.txt", new java.lang.Object[0]);
            com.p314xaae8f345.mm.ui.yk.a("mobeta", e17.getMessage(), new java.lang.Object[0]);
        }
    }

    public void a() {
        java.lang.StringBuilder sb6 = this.f519469a;
        if (!this.f519473e) {
            return;
        }
        java.io.BufferedWriter bufferedWriter = null;
        try {
            java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.f519470b, this.f519472d != 0), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            try {
                bufferedWriter2.write(sb6.toString());
                sb6.delete(0, sb6.length());
                bufferedWriter2.flush();
                this.f519472d++;
                try {
                    bufferedWriter2.close();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.mm.ui.yk.d("DragSortListView", e17, "IOException", new java.lang.Object[0]);
                }
            } catch (java.io.IOException unused) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (java.io.IOException e18) {
                        com.p314xaae8f345.mm.ui.yk.d("DragSortListView", e18, "IOException", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.mm.ui.yk.d("DragSortListView", e19, "IOException", new java.lang.Object[0]);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
