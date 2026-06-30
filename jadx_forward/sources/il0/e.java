package il0;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final il0.e f373542f = new il0.e();

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f373543a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f373544b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f373545c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f373546d = false;

    /* renamed from: e, reason: collision with root package name */
    public dm0.e f373547e = null;

    public e() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(new il0.a(this));
        ki.i.f389634c.b(new il0.c(this));
    }

    public static java.lang.String c() {
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        new il0.d();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_6d2cb220", "details_json");
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "get details_json failed");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            java.io.FileReader fileReader = new java.io.FileReader(Ui.m117639xfb83cc9b());
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb6.append(readLine);
                        sb6.append("\n");
                    } finally {
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Kara.DiscoveryReddotEnv", e17, "read file error", new java.lang.Object[0]);
        }
        return sb6.toString();
    }

    public final boolean a() {
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        new il0.d();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_6d2cb220", "discovery_reddot_model_tflite");
        if (Ui != null) {
            return android.text.TextUtils.equals(Ui.m117637xb5885648(), this.f373545c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "discovery_reddot_model_tfliteFile is null");
        return false;
    }

    public synchronized void b() {
        if (this.f373546d) {
            this.f373546d = false;
            java.util.List list = this.f373543a;
            if (list != null) {
                list.clear();
                this.f373543a = null;
            }
            java.util.List list2 = this.f373544b;
            if (list2 != null) {
                list2.clear();
                this.f373544b = null;
            }
            dm0.e eVar = this.f373547e;
            if (eVar != null) {
                synchronized (eVar) {
                    org.p3367x5a555907.p3368x32b0ae.d dVar = eVar.f323162a;
                    if (dVar != null) {
                        dVar.close();
                        eVar.f323162a = null;
                    }
                }
                this.f373547e = null;
            }
        }
    }

    public java.util.List d() {
        if (this.f373543a == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String c17 = c();
            if (android.text.TextUtils.isEmpty(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "get details_json failed");
            } else {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(c17).getJSONArray("feature_names");
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        arrayList.add(jSONArray.getString(i17));
                    }
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Kara.DiscoveryReddotEnv", e17, "json parse error", new java.lang.Object[0]);
                }
            }
            this.f373543a = arrayList;
        }
        return this.f373543a;
    }

    public java.util.List e() {
        if (this.f373544b == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String c17 = c();
            if (android.text.TextUtils.isEmpty(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "get details_json failed");
            } else {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(c17).getJSONArray("label_names");
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        arrayList.add(jSONArray.getString(i17));
                    }
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Kara.DiscoveryReddotEnv", e17, "json parse error", new java.lang.Object[0]);
                }
            }
            this.f373544b = arrayList;
        }
        return this.f373544b;
    }

    public synchronized boolean f() {
        this.f373546d = false;
        if (!am0.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "PredictEnv.init failed");
            return false;
        }
        if (!g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "model init failed");
            return false;
        }
        java.lang.String c17 = c();
        java.lang.String str = null;
        if (!android.text.TextUtils.isEmpty(c17)) {
            try {
                str = new org.json.JSONObject(c17).getString("tflite_md5");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Kara.DiscoveryReddotEnv", e17, "checkMd5 json parse error", new java.lang.Object[0]);
            }
        }
        this.f373545c = str;
        if (!a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "check md5 failed");
            return false;
        }
        if (!h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "initPredictor failed");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.DiscoveryReddotEnv", "env init success");
        this.f373546d = true;
        return true;
    }

    public final boolean g() {
        new il0.d();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_6d2cb220", "details_json");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui2 = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_6d2cb220", "discovery_reddot_model_tflite");
        if (Ui != null && Ui2 != null) {
            this.f373543a = d();
            this.f373544b = e();
            if (this.f373543a.size() != 0 && this.f373544b.size() != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        new il0.d();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_6d2cb220", "discovery_reddot_model_tflite");
        boolean z17 = false;
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "discovery_reddot_model_tfliteFile is null");
            return false;
        }
        java.lang.String m117639xfb83cc9b = Ui.m117639xfb83cc9b();
        dm0.e eVar = new dm0.e(m117639xfb83cc9b);
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(m117639xfb83cc9b);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(a17.m82499x9616526c(), "rw");
                java.nio.MappedByteBuffer map = randomAccessFile.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, randomAccessFile.getFilePointer(), randomAccessFile.getFilePointer() + randomAccessFile.length());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.TfLiteMultiClassifyPredict", "get mappedByteBuffer succ");
                eVar.f323162a = new org.p3367x5a555907.p3368x32b0ae.d(map.asReadOnlyBuffer());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.TfLiteMultiClassifyPredict", "get Interpreter succ");
                z17 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.TfLiteMultiClassifyPredict", "model file not exists:".concat(m117639xfb83cc9b));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.TfLiteMultiClassifyPredict", "load model error!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Kara.TfLiteMultiClassifyPredict", e17, "", new java.lang.Object[0]);
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.DiscoveryReddotEnv", "Predictor init success");
            this.f373547e = eVar;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv", "Predictor init fail");
        }
        return z17;
    }
}
