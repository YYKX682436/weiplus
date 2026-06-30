package et5;

/* loaded from: classes15.dex */
public abstract class f {
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.b1 a(ry3.s wxqBarAiModelParam) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxqBarAiModelParam, "wxqBarAiModelParam");
        com.p314xaae8f345.p2891x34da02.C25307xad2910d9 c25307xad2910d9 = wxqBarAiModelParam.f483089b;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.b1 b1Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.b1();
        java.lang.String str6 = "";
        if (c25307xad2910d9 == null || (str = c25307xad2910d9.f45396x832f8c70) == null) {
            str = "";
        }
        b1Var.f298487d = str;
        b1Var.f298495o = c25307xad2910d9 != null ? c25307xad2910d9.f45395xc84327b2 : null;
        if (c25307xad2910d9 == null || (str2 = c25307xad2910d9.f45403xb37d6834) == null) {
            str2 = "";
        }
        b1Var.f298488e = str2;
        if (c25307xad2910d9 == null || (str3 = c25307xad2910d9.f45402x8b863196) == null) {
            str3 = "";
        }
        b1Var.f298497q = str3;
        b1Var.f298489f = c25307xad2910d9 != null ? c25307xad2910d9.f45399x70dd9799 : false;
        if (c25307xad2910d9 == null || (str4 = c25307xad2910d9.f45401xe9487ac4) == null) {
            str4 = "";
        }
        b1Var.f298490g = str4;
        b1Var.f298493m = c25307xad2910d9 != null ? c25307xad2910d9.f45394x83deee29 : false;
        b1Var.f298491h = c25307xad2910d9 != null ? c25307xad2910d9.f45398xadb11991 : false;
        if (c25307xad2910d9 != null && (str5 = c25307xad2910d9.f45400x47104a15) != null) {
            str6 = str5;
        }
        b1Var.f298492i = str6;
        int[] readers = wxqBarAiModelParam.f483092e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readers, "readers");
        boolean z17 = !(readers.length == 0);
        java.util.LinkedList linkedList = b1Var.f298499s;
        if (z17) {
            int[] readers2 = wxqBarAiModelParam.f483092e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readers2, "readers");
            linkedList.addAll(kz5.z.x0(readers2));
        }
        b1Var.f298500t = wxqBarAiModelParam.f483091d;
        java.util.LinkedList linkedList2 = b1Var.f298501u;
        linkedList2.clear();
        java.util.List list = wxqBarAiModelParam.f483093f;
        if (list != null) {
            linkedList2.addAll(list);
        }
        java.util.LinkedList linkedList3 = b1Var.f298502v;
        linkedList3.clear();
        java.util.List list2 = wxqBarAiModelParam.f483094g;
        if (list2 != null) {
            linkedList3.addAll(list2);
        }
        b1Var.f298503w = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z.Android_CrossPlatform;
        b1Var.f298504x = wxqBarAiModelParam.f483088a == 0 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.w.SCAN_VIDEO : com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.w.SCAN_FILE;
        b1Var.f298505y = wxqBarAiModelParam.f483095h;
        b1Var.f298506z = wxqBarAiModelParam.f483096i;
        b1Var.A = wxqBarAiModelParam.f483097j;
        b1Var.B = wxqBarAiModelParam.f483098k;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transformToScanQBarModelParams ScanQBarModelParams: {\ndetectModelPath: ");
        sb6.append(b1Var.f298487d);
        sb6.append(",\nsuperResolutionModelPath: ");
        sb6.append(b1Var.f298488e);
        sb6.append(",\nsegmentationModelPath: ");
        sb6.append(b1Var.f298490g);
        sb6.append(", enableSeg: ");
        sb6.append(b1Var.f298489f);
        sb6.append(",\nreverseClsModelPath: ");
        sb6.append(b1Var.f298492i);
        sb6.append(", enableReverseCls: ");
        sb6.append(b1Var.f298491h);
        sb6.append(",\nenableDetectFp16: ");
        sb6.append(b1Var.f298493m);
        sb6.append(",\nsupportReaderType: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getSupportReaderType(...)");
        sb6.append(kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null));
        sb6.append(",\nblackInterval: ");
        sb6.append(b1Var.f298500t);
        sb6.append(",\nwhiteList: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getWhiteList(...)");
        sb6.append(kz5.n0.g0(linkedList2, ",", null, null, 0, null, null, 62, null));
        sb6.append(",\nblackList: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList3, "getBlackList(...)");
        sb6.append(kz5.n0.g0(linkedList3, ",", null, null, 0, null, null, 62, null));
        sb6.append(",\nscanMode: ");
        sb6.append(b1Var.f298504x);
        sb6.append(",\nenableOperateReporter: ");
        sb6.append(b1Var.f298505y);
        sb6.append("\nenableScanGoodsCrossPlatform: ");
        sb6.append(b1Var.B);
        sb6.append("\n}");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXQBarAiModelParamUtils", sb6.toString());
        return b1Var;
    }
}
