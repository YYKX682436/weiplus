package mz4;

/* loaded from: classes12.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str) {
        return str.replaceAll("<font", "<wx-font").replaceAll("<div", "<wx-div").replaceAll("<p", "<wx-p").replaceAll("</font>", "</wx-font>").replaceAll("<ul>", "<wx-ul>").replaceAll("</ul>", "</wx-ul>").replaceAll("<ol>", "<wx-ol>").replaceAll("</ol>", "</wx-ol>").replaceAll("<li>", "<wx-li>").replaceAll("</li>", "</wx-li>").replaceAll("<b>", "<wx-b>").replaceAll("</b>", "</wx-b>").replaceAll("<mark>", "<wx-mark>").replaceAll("</mark>", "</wx-mark>").replaceAll("</div>", "</wx-div>").replaceAll("</p>", "</wx-p>");
    }
}
