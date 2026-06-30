package by5;

/* loaded from: classes13.dex */
public class e2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        if (lVar != null && lVar.getWebView() != null) {
            com.tencent.xweb.WebView webView = lVar.getWebView();
            java.io.File externalCacheDir = context.getExternalCacheDir();
            java.io.File[] listFiles = externalCacheDir.listFiles();
            boolean z17 = true;
            if (listFiles == null || listFiles.length == 0) {
                by5.a1.g(context, "请确认应用权限，再确认指定目录下存在文件", true);
            } else {
                java.lang.String str = externalCacheDir.getAbsolutePath() + java.io.File.separator + "xweb_dump";
                try {
                    java.io.File[] listFiles2 = new java.io.File(str).listFiles();
                    if (listFiles2 == null || listFiles2.length == 0) {
                        by5.a1.g(context, "xweb_dump目录下没有.zip文件", true);
                    } else {
                        for (int i17 = 0; i17 < listFiles2.length; i17++) {
                            if (listFiles2[i17].getName().endsWith(".zip")) {
                                java.lang.String absolutePath = listFiles2[i17].getAbsolutePath();
                                java.lang.String name = listFiles2[i17].getName();
                                new android.app.AlertDialog.Builder(context).setTitle("提示").setMessage("确定加载:" + name + "?").setPositiveButton("确定", new qx5.k0(webView, str, absolutePath, name)).setNegativeButton("取消", new qx5.j0()).show();
                                break;
                            }
                        }
                        by5.a1.g(context, "xweb_dump目录下没有.zip文件", true);
                    }
                } catch (java.lang.Exception unused) {
                    by5.a1.g(context, "没有找到xweb_dump目录", true);
                }
            }
            z17 = false;
            if (z17) {
                return qx5.a.b();
            }
        }
        return qx5.a.a();
    }
}
