package qz4;

/* loaded from: classes12.dex */
public abstract class b {
    public static java.lang.String a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() == 0) {
            return str;
        }
        return java.util.regex.Pattern.compile("&nbsp;", 2).matcher(java.util.regex.Pattern.compile("<[^>]*>", 2).matcher(java.util.regex.Pattern.compile("</p>", 2).matcher(java.util.regex.Pattern.compile("<p [^>]*>", 2).matcher(java.util.regex.Pattern.compile("<hr[^>]*>", 2).matcher(java.util.regex.Pattern.compile("</wx-todo>", 2).matcher(java.util.regex.Pattern.compile("</wx-li>", 2).matcher(java.util.regex.Pattern.compile("<div>", 2).matcher(java.util.regex.Pattern.compile("<br[^>]*>", 2).matcher(str).replaceAll("\n")).replaceAll("")).replaceAll("\n")).replaceAll("\n")).replaceAll("\n")).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll(" ");
    }

    public static java.util.ArrayList b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() == 0) {
            return null;
        }
        java.lang.String[] split = java.util.regex.Pattern.compile("\n", 2).matcher(java.util.regex.Pattern.compile("<div></div>", 2).matcher(java.util.regex.Pattern.compile("</object>", 2).matcher(java.util.regex.Pattern.compile("<hr[^>]*>", 2).matcher(java.util.regex.Pattern.compile("<object[^>]*>", 2).matcher(java.util.regex.Pattern.compile("<head[^>]*></head>", 2).matcher(java.util.regex.Pattern.compile("<div><object[^>]*></object></div>", 2).matcher(str).replaceAll("<object>")).replaceAll("")).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#")).replaceAll("#WNNoteNode#<ThisisNoteNodeHrObj>#WNNoteNode#")).replaceAll("")).replaceAll("")).replaceAll("").replaceAll("<br>", "<br/>").trim().split("#WNNoteNode#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : split) {
            if (str2.length() > 0) {
                java.lang.String replace = str2.replace("</div>", "<div>");
                int lastIndexOf = replace.endsWith("<div>") ? replace.lastIndexOf("<div>") : -1;
                if (lastIndexOf > 0) {
                    replace = replace.substring(0, lastIndexOf);
                }
                arrayList.add(replace.replace("<div><br/>", "<div>"));
            }
        }
        return arrayList;
    }
}
