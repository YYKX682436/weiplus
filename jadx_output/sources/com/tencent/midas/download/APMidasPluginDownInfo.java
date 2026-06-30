package com.tencent.midas.download;

/* loaded from: classes13.dex */
public class APMidasPluginDownInfo {
    public java.lang.String split_download_url;
    public java.lang.String new_md5_encode = "";
    public java.lang.String new_md5_decode = "";
    public java.lang.String name = "";
    public int size = 0;
    public int fullsize = 0;
    public java.lang.String down_url = "";
    public java.lang.String full_url = "";
    public boolean is_split = false;
    public boolean is_force = false;
    public java.lang.String old_md5 = "";
    public java.lang.String diff_md5 = "";
    public int update_version = 0;

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.tencent.midas.download.APMidasPluginDownInfo)) {
            return this.name.equals(((com.tencent.midas.download.APMidasPluginDownInfo) obj).name);
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
